package de.florianmarsch.spring.socialmediacalendar.persistence;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPosting is a Querydsl query type for Posting
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPosting extends EntityPathBase<Posting> {

    private static final long serialVersionUID = -619179091L;

    public static final QPosting posting = new QPosting("posting");

    public final StringPath channel = createString("channel");

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final StringPath link = createString("link");

    public final StringPath picture = createString("picture");

    public final DateTimePath<java.util.Date> plannedDate = createDateTime("plannedDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> publishDate = createDateTime("publishDate", java.util.Date.class);

    public final StringPath status = createString("status");

    public final StringPath text = createString("text");

    public final StringPath title = createString("title");

    public QPosting(String variable) {
        super(Posting.class, forVariable(variable));
    }

    public QPosting(Path<Posting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPosting(PathMetadata metadata) {
        super(Posting.class, metadata);
    }

}

