package com.nicolas.microservicioscursos.impl;

import com.nicolas.microservicioscursos.entities.Curso;
import com.nicolas.microservicioscursos.services.CursoService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CursoServiceImpl implements CursoService {

    @Override
    public void flush() {

    }

    @Override
    public <S extends Curso> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Curso> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Curso> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Curso getOne(Long aLong) {
        return null;
    }

    @Override
    public Curso getById(Long aLong) {
        return null;
    }

    @Override
    public Curso getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Curso> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Curso> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Curso> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Curso> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Curso> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Curso> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Curso, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Curso> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Curso> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Curso> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Curso> findAll() {
        return null;
    }

    @Override
    public List<Curso> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Curso entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Curso> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Curso> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Curso> findAll(Pageable pageable) {
        return null;
    }
}
