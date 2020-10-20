package de.florianmarsch.spring.socialmediacalendar.config

import de.florianmarsch.spring.socialmediacalendar.SocialMediaCalendarApplication
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import java.io.IOException
import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
@Order(1)
class AuthenticationFilter : Filter {

    var logger: Logger = LoggerFactory.getLogger(AuthenticationFilter::class.java)


    @Value("\${authToken}")
    private val token: String? = null

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(
            request: ServletRequest,
            response: ServletResponse,
            chain: FilterChain) {


        //chain.doFilter(request, response)

        with(request as HttpServletRequest){

            val header: String? = getHeader("Authorization")
            logger.trace(header)

            when(header){
                ("Basic $token") -> chain.doFilter(request, response)
                else -> this@AuthenticationFilter.authFailed(response)
            }


        }


    }

    fun authFailed(response : ServletResponse){
        response.writer.write("Error")
        (response as HttpServletResponse).status = 401
    }
}