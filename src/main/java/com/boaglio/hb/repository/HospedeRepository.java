package com.boaglio.hb.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Repository;

import com.boaglio.hb.model.Hospede;

@Repository
public class HospedeRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Hospede> buscaTodos(String criterioDeBusca) {

		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny(criterioDeBusca);

		Query query = TextQuery.queryText(criteria).sortByScore().with(new PageRequest(0,100));

		List<Hospede> hospedes = mongoTemplate.find(query,Hospede.class);

		return hospedes;
	}

	public Hospede busca(String hospedeID) {

		Hospede hospede = null;

		// db.hospedes.find({"_id":1972399})
		Query queryDeBuscaPorID = new Query(Criteria.where("id").is(hospedeID));

		hospede = mongoTemplate.findOne(queryDeBuscaPorID,Hospede.class);

		return hospede;
	}
}
