package com.flux.dbservice.repository.parsing;

import com.flux.dbservice.entity.parsing.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    Group getByName(String groupName);
}
