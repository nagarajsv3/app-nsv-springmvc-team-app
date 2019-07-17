1. Spring Transaction Management
2. Transaction Properties ACID
Atomic 
Consistency
Isolation
Durable
3. Isolation
    a. Default
    b. Read uncommited
    c. Read Commited - most preferred
    d. Repeated reads - row level lock
    e. serializable - table level lock
4. Types of reads
    a. Dirty reads
    b. Phantom reads
    c. Repeatable/Non repeatable reads
    
Steps in Declarative Transaction Manager
1. Use @Transactional annotation
2. Define TransactionManager . Search with PlatformTransactionManager to get all the TransactionManager.
    For Hibernate , HibernateTransactionManager
    For JPA, JPATransactionManager
3. In Java Config, 
    Use @EnableTransactionManagement annotation and define TransactionManager bean.
    
   In XML Config,
    Use <tx-annotation-driven> element and define TransactionManager bean inside xml.
4. Only for update/delete we use @Transactional
@Transactional can be applied at class/method level
@Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)

Propogation
REQUIRED
REQUIRES_NEW
SUPPORTED
NOT_SUPPORTED
NEVER

Types in Programmatic Transaction Manager
1. TransactionTemplate -> 
    a. create an instance of TransactionTemplate using PlatformTransactionManager
    b. transactionTemplate.execute(Actual Method Need to be run in a transaction) 
2. PlatformTransactionManager


Spring AOP - Aspect Oriented Programming
To address cross cutting concerns

Advice
JoinPoint
PointCut
Aspect