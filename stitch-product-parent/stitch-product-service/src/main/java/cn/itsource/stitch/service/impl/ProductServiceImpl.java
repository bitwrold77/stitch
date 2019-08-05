package cn.itsource.stitch.service.impl;

import cn.itsource.stitch.domain.Product;
import cn.itsource.stitch.mapper.ProductMapper;
import cn.itsource.stitch.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author å²è¿ªä»
 * @since 2019-07-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
