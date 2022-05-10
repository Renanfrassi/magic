package com.zappts.zappts.service.mapper;

import java.util.List;

public interface GenericoMapper<D, E> {

    E paraEntidade(D dto);

    List<E> paraEntidade(List<D> listaDto);

    D paraDto(E entidade);

    List<D> paraDto(List<E> listaEntidade);
}