package com.alchk.awsec2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyJpaRepository extends JpaRepository<DummyEntity, String> {
}
