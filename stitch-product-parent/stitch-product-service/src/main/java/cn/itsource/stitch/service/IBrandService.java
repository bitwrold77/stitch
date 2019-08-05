package cn.itsource.stitch.service;

import cn.itsource.stitch.domain.Brand;
import cn.itsource.stitch.query.BrandQuery;
import cn.itsource.stitch.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author å²è¿ªä»
 * @since 2019-07-31
 */
public interface IBrandService extends IService<Brand> {




    PageList<Brand> queryPage(BrandQuery query);
}
