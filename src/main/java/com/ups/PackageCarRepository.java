package com.ups;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

/**
 * Created by dbg1lnb on 10/13/2016.
 */

public interface PackageCarRepository extends CouchbaseRepository<PackageCar, String> {
}
