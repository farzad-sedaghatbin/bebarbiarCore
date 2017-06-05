package ir.anijuu.products.repository.search;

import ir.anijuu.products.domain.Color;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the Color entity.
 */
public interface ColorSearchRepository extends ElasticsearchRepository<Color, Long> {
}
