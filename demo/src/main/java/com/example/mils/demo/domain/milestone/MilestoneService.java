package com.example.mils.demo.domain.milestone;

import java.util.List;

public class MilestoneService {
  public List<MilestoneEntity> findAll() {
    return List.of(
      new MilestoneEntity(1, "マイルストーン１", "説明１"),
      new MilestoneEntity(2, "マイルストーン２", "説明２"),
      new MilestoneEntity(3, "マイルストーン３", "説明３")
    );
  }
}
