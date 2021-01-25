//package day5;
//
//import day5.utils.JdbcUtils;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//
//public class Jdbc2Test {
//    public static void main(String[] args) {
//
//    }
//    public static void select() {
//        ArrayList<Student> stulist = new ArrayList<Student>();
//        int all = 0;
//        PreparedStatement ps = null;
//        PreparedStatement ps2 = null;
//        Connection connection = null;
//        ResultSet resultSet = null;
//        ResultSet resultSet2 = null;
//        Page p = new Page();
//        p.setPagenum(0);
//        try {
//            connection = JdbcUtils.connect();
//            String sql2 = "select count(*) as allcount from employee";
//            ps2 = connection.prepareStatement(sql2);
//            resultSet2= ps2.executeQuery();
//            while (resultSet2.next()){
//                all = resultSet2.getInt("allcount");
//            }
////            int allpage = all%p.getPageSize()==0?all/p.getPageSize():(all/p.getPageSize())+1;
//            int starnum =0;
//            while(starnum<all){
//                String sql = "select * from employee LIMIT ?,?";
//                ps = connection.prepareStatement(sql);
//                ps.setInt(1,starnum);
//                ps.setInt(2,p.getPageSize());
//                resultSet = ps.executeQuery();
//                while (resultSet.next()) {
//                    int id = resultSet.getInt("id");
//                    int deptno = resultSet.getInt("deptno");
//                    String ename = resultSet.getString("ename");
//                    int sal = resultSet.getInt("sal");
//                    int comm = resultSet.getInt("comm");
//                    String job = resultSet.getString("job");
//                    String hiredate = resultSet.getString("hiredate");
//
//                    Student student = new Student();
//                    student.setId(id);
//                    student.setDeptno(deptno);
//                    student.setEname(ename);
//                    student.setSal(sal);
//                    student.setComm(comm);
//                    student.setJob(job);
//                    student.setHiredate(hiredate);
//
//                    stulist.add(student);
//                }
//                System.out.println("====================================");
//                stulist.stream().forEach(System.out::println);
//                starnum=starnum+p.getPageSize();
//                stulist.removeAll(stulist);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            Jdbcutils.close(resultSet,ps,connection);
//        }
//    }
//}
//}
