dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	url = "jdbc:mysql://localhost:3306/daniel?useUnicode=yes&characterEncoding=UTF-8"
	username="root"
	password="root"
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
}

// environment specific settings
environments {
	development {
		dataSource {
		dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
		url = "jdbc:mysql://localhost:3306/daniel?useUnicode=yes&characterEncoding=UTF-8"
		 }
	}
	test {
		dataSource {
		 dbCreate= "update"
		url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			driverClassName = 'com.mysql.jdbc.Driver'
			dialect = org.hibernate.dialect.MySQL5InnoDBDialect

			String host = System.getenv('OPENSHIFT_MYSQL_DB_HOST').toString()
			String port = System.getenv('OPENSHIFT_MYSQL_DB_PORT').toString()
			String dbName = "daniel"
			url = "jdbc:mysql://$host:$port/$dbName"
			username = System.getenv('OPENSHIFT_MYSQL_DB_USERNAME').toString()
			password = System.getenv('OPENSHIFT_MYSQL_DB_PASSWORD').toString()
			properties {
				maxActive = -1
				minEvictableIdleTimeMillis=1800000
				timeBetweenEvictionRunsMillis=1800000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=false
				validationQuery="SELECT 1"
				jdbcInterceptors="ConnectionState"
			}
		}
	}
}
