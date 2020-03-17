package com.example.interview.repositories;

import java.util.UUID;

public interface UserReportersLdapRepository {

    UserReporters getReporters(final UUID managerId);

}
