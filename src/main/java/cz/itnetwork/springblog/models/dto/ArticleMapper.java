package cz.itnetwork.springblog.models.dto;

import cz.itnetwork.springblog.data.entities.ArticleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import cz.itnetwork.springblog.models.dto.ArticleDTO;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleEntity toEntity(ArticleDTO source);
    ArticleDTO toDTO(ArticleEntity source);

    void updateArticleDTO(ArticleDTO source, @MappingTarget ArticleDTO target);
    void updateArticleEntity(ArticleDTO source, @MappingTarget ArticleEntity target);
}

