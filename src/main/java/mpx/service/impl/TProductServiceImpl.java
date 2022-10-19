package mpx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mpx.domain.TProduct;
import mpx.service.TProductService;
import mpx.mapper.TProductMapper;
import org.springframework.stereotype.Service;

/**
* @author 1234
* @description 针对表【t_product】的数据库操作Service实现
* @createDate 2022-10-19 16:13:26
*/
@Service
public class TProductServiceImpl extends ServiceImpl<TProductMapper, TProduct>
    implements TProductService{

}




