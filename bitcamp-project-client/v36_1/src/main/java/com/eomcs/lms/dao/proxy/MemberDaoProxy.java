package com.eomcs.lms.dao.proxy;

import java.util.List;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Lesoon;

// 프록시 객체는 항상 작업 객체와 동일한 인터페이스를 구현해야 한다.
// => 마치 자신이 작업 객체인양 보이기 위함이다.
// => MemberDao 작업 객체를 대행할 프록시를 정의한다.
//
public class MemberDaoProxy implements MemberDao {

  DaoProxyHelper daoProxyHelper;

  public MemberDaoProxy(DaoProxyHelper daoProxyHelper) {
    this.daoProxyHelper = daoProxyHelper;
  }

  @Override
  public int insert(Lesoon member) throws Exception {
    MemberInsertWorker worker = new MemberInsertWorker(member);
    return (int) daoProxyHelper.request(worker);
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Lesoon> findAll() throws Exception {
    return (List<Lesoon>) daoProxyHelper.request((in, out) -> {
      out.writeUTF("/member/list");
      out.flush();
      String response = in.readUTF();
      if (response.equals("FAIL")) {
        throw new Exception(in.readUTF());
      }
      return (List<Lesoon>) in.readObject();
    });
  }

  @Override
  public Lesoon findByNo(int no) throws Exception {
    return (Lesoon) daoProxyHelper.request((in, out) -> {
      out.writeUTF("/member/detail");
      out.writeInt(no);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        throw new Exception(in.readUTF());
      }
      return (Lesoon) in.readObject();
    });
  }

  @Override
  public int update(Lesoon member) throws Exception {
    return (int) daoProxyHelper.request((in, out) -> {
      out.writeUTF("/member/update");
      out.writeObject(member);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        throw new Exception(in.readUTF());
      }
      return 1;
    });
  }

  @Override
  public int delete(int no) throws Exception {
    return (int) daoProxyHelper.request((in, out) -> {
      out.writeUTF("/member/delete");
      out.writeInt(no);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        throw new Exception(in.readUTF());
      }
      return 1;
    });
  }
}
