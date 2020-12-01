package com.example.thymedemo.dao;

        import com.example.thymedemo.entity.StaffInfo;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import java.util.List;


public interface StaffInfoDao extends JpaRepository<StaffInfo, Integer> {

    @Query(value = "select a.dept_name,COALESCE(b.num,0) as num,COALESCE(b.names,'空') as names from\n" +
            "\t (select distinct dept_name from staff) a\n" +
            "\tleft join ( select dept_name,count(*) num,GROUP_CONCAT(staff_name) as names from staff where exit_or_enter=1 GROUP BY dept_name) b\n" +
            "\ton a.dept_name=b.dept_name",nativeQuery = true
    )
    List<Object[]> findContent();
}
