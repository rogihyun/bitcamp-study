package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Lesoon;

public class MemberDaoImpl implements MemberDao {

  @Override
  public int insert(Lesoon member) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("insert into lms_member(name, email, pwd, tel, photo) "
          + "values('" + member.getName() + "', '" + member.getEmail() + "', '"
          + member.getPassword() + "', '" + member.getTel() + "', '" + member.getPhoto() + "')");

      return result;
    }
  }

  @Override
  public List<Lesoon> findAll() throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select member_id, name, email, tel, cdt from lms_member")) {

      ArrayList<Lesoon> list = new ArrayList<>();

      while (rs.next()) {
        Lesoon member = new Lesoon();

        member.setNo(rs.getInt("member_id"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setTel(rs.getString("tel"));
        member.setRegisteredDate(rs.getDate("cdt"));

        list.add(member);
      }

      return list;
    }
  }

  @Override
  public Lesoon findByNo(int no) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select member_id, name, email, pwd, tel, photo" + " from lms_member"
                + " where member_id=" + no)) {

      if (rs.next()) {
        Lesoon member = new Lesoon();
        member.setNo(rs.getInt("member_id"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setPassword(rs.getString("pwd"));
        member.setTel(rs.getString("tel"));
        member.setPhoto(rs.getString("photo"));
        return member;

      } else {
        return null;
      }
    }
  }

  @Override
  public int update(Lesoon member) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement()) {

      int result =
          stmt.executeUpdate("update lms_member set name= '" + member.getName() + "', email='"
              + member.getEmail() + "', pwd='" + member.getPassword() + "', tel='" + member.getTel()
              + "', photo='" + member.getPhoto() + "' where member_id=" + member.getNo());

      return result;
    }
  }

  @Override
  public int delete(int no) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("delete from lms_member where member_id=" + no);

      return result;
    }
  }

}
