package com.inetpsa.pct01.pmtapplication.repository.search;

import com.inetpsa.pct01.pmtapplication.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
