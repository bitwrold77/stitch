package cn.itsource.stitch.service;

import cn.itsource.stitch.domain.Brand;
import cn.itsource.stitch.util.PageList;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandServiceTest {

    @Autowired
    private IBrandService brandService;

    @Test
    public void test(){
        brandService.list().forEach(e->{
            System.out.println(e);
        });
    }


    @Test
    public void test1(){
        IPage<Brand> page = brandService.page(new Page<Brand>(1, 10));
        System.out.println(page.getSize());
        page.getRecords().forEach(e->{
            System.out.println(e);
        });
        PageList<Brand> pageList = new PageList<>(page.getTotal(), page.getRecords());
    }
}