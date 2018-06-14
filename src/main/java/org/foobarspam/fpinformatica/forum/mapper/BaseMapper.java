package org.foobarspam.fpinformatica.forum.mapper;

import org.mapstruct.Mapper;

import java.util.List;


public interface BaseMapper<E, D> {

    List<D> toDTO(List<E> entity);
//
    List<E> toEntity(List<D> dto);

    D toDTO(E entity);
//
    E toEntity(D dto);
}
