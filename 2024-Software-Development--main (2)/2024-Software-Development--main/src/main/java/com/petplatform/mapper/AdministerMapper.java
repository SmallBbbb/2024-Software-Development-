package com.petplatform.mapper;

import com.petplatform.POJO.Administer;

public interface AdministerMapper {
    Administer selectAdministerByUsername(Administer administer);
}
