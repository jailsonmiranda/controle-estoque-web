package br.com.aioprojs.controleestoque.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends MongoRepository<Fornecedor, ObjectId>{

}
