package com.eomcs.lms.dao.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.domain.Lesoon;

public class MemberInsertWorker implements Worker {
  Lesoon member;

  public MemberInsertWorker(Lesoon member) {
    this.member = member;
  }

  @Override
  public Object execute(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("/member/add");
    out.writeObject(member);
    out.flush();

    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }

    return 1;
  }
}
