package com.sale.watch;

import org.springframework.data.repository.CrudRepository;

import com.sale.flashsale.MyWatch;

public interface WatchRepository extends CrudRepository<MyWatch, Long>{

}
