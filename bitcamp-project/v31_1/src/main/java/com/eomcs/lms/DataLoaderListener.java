package com.eomcs.lms;

import com.eomcs.lms.context.AppllcationContextListener;

// 애플리케이션이 시작되거나 종료될 떄
// 데이터를 로딩하고 저장하는 일을 한다.
//
public class DataLoaderListener implements AppllcationContextListener{

  @Override
  public void contextInitialized() {
   System.out.println("데이터를 로딩합니다.");
  }

  @Override
  public void contextDestroyed() {
    System.out.println("데이터를 로딩합니다.");
  }
}
