package cn.itsource.stitch.service.impl;

import cn.itsource.stitch.domain.Brand;
import cn.itsource.stitch.mapper.BrandMapper;
import cn.itsource.stitch.query.BrandQuery;
import cn.itsource.stitch.service.IBrandService;
import cn.itsource.stitch.util.PageList;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author å²è¿ªä»
 * @since 2019-07-31
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Override
    //当前有事务在，就加入到当前事务中，当前没有事务，就以非事务运行
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public PageList<Brand> queryPage(BrandQuery query) {

        Page<Brand> page = new Page<>(query.getPageNum(), query.getPageSize());
        IPage<Brand> iPage = baseMapper.queryPage(page, query);
        return new PageList<>(iPage.getTotal(),iPage.getRecords());
    }
}
