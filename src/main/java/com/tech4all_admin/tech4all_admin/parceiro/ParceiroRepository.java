package com.tech4all_admin.tech4all_admin.parceiro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro, Integer> {
}
