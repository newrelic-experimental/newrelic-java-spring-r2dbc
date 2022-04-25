package org.springframework.data.r2dbc.core;

import java.util.function.Function;

import org.reactivestreams.Publisher;
import org.springframework.data.relational.core.query.Query;
import org.springframework.data.relational.core.query.Update;
import org.springframework.data.relational.core.sql.SqlIdentifier;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

import reactor.core.publisher.Mono;

@Weave
public abstract class R2dbcEntityTemplate {

	@Trace
	Mono<Long> doCount(Query query, Class<?> entityClass, SqlIdentifier tableName){
		if(tableName != null) {
			String id = tableName.getReference();
			if(id != null) {
				NewRelic.getAgent().getTracedMethod().setMetricName("Custom","R2dbcEntityTemplate","Count",id);
			}
		}
		Mono<Long> result = Weaver.callOriginal();
		
		return result;
	}
	
	@Trace
	Mono<Integer> doDelete(Query query, Class<?> entityClass, SqlIdentifier tableName) {
		if(tableName != null) {
			String id = tableName.getReference();
			if(id != null) {
				NewRelic.getAgent().getTracedMethod().setMetricName("Custom","R2dbcEntityTemplate","Delete",id);
			}
		}
		Mono<Integer> result = Weaver.callOriginal();
		
		return result;
	}
	
	@Trace
	Mono<Boolean> doExists(Query query, Class<?> entityClass, SqlIdentifier tableName) {
		if(tableName != null) {
			String id = tableName.getReference();
			if(id != null) {
				NewRelic.getAgent().getTracedMethod().setMetricName("Custom","R2dbcEntityTemplate","Exists",id);
			}
		}
		Mono<Boolean> result = Weaver.callOriginal();
		
		return result;
	}
	
	@Trace
	<T> Mono<T> doInsert(T entity, SqlIdentifier tableName) {
		if(tableName != null) {
			String id = tableName.getReference();
			if(id != null) {
				NewRelic.getAgent().getTracedMethod().setMetricName("Custom","R2dbcEntityTemplate","Insert",id);
			}
		}
		Mono<T> result = Weaver.callOriginal();
		
		return result;
	}
	
	<T, P extends Publisher<T>> P doSelect(Query query, Class<?> entityClass, SqlIdentifier tableName,
			Class<T> returnType, Function<RowsFetchSpec<T>, P> resultHandler) {
		if(tableName != null) {
			String id = tableName.getReference();
			if(id != null) {
				NewRelic.getAgent().getTracedMethod().setMetricName("Custom","R2dbcEntityTemplate","Select",id);
			}
		}
		
		
		return  Weaver.callOriginal();
	}
	
	@Trace
	Mono<Integer> doUpdate(Query query, Update update, Class<?> entityClass, SqlIdentifier tableName) {
		if(tableName != null) {
			String id = tableName.getReference();
			if(id != null) {
				NewRelic.getAgent().getTracedMethod().setMetricName("Custom","R2dbcEntityTemplate","Update",id);
			}
		}
		Mono<Integer> result = Weaver.callOriginal();
		
		return result;
		
	}
}
