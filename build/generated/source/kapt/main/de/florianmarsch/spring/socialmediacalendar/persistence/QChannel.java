package de.florianmarsch.spring.socialmediacalendar.persistence;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChannel is a Querydsl query type for Channel
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChannel extends EntityPathBase<Channel> {

    private static final long serialVersionUID = 510973294L;

    public static final QChannel channel = new QChannel("channel");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath strategy = createString("strategy");

    public final StringPath username = createString("username");

    public QChannel(String variable) {
        super(Channel.class, forVariable(variable));
    }

    public QChannel(Path<Channel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannel(PathMetadata metadata) {
        super(Channel.class, metadata);
    }

}

