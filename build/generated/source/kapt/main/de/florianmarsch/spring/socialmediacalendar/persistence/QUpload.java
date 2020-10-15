package de.florianmarsch.spring.socialmediacalendar.persistence;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUpload is a Querydsl query type for Upload
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUpload extends EntityPathBase<Upload> {

    private static final long serialVersionUID = 539524150L;

    public static final QUpload upload = new QUpload("upload");

    public final StringPath file = createString("file");

    public final StringPath id = createString("id");

    public QUpload(String variable) {
        super(Upload.class, forVariable(variable));
    }

    public QUpload(Path<Upload> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUpload(PathMetadata metadata) {
        super(Upload.class, metadata);
    }

}

