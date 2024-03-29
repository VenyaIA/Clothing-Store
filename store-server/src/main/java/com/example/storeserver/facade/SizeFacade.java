package com.example.storeserver.facade;

import com.example.storeserver.dto.SizeDTO;
import com.example.storeserver.entity.Size;
import org.springframework.stereotype.Component;

@Component
public class SizeFacade {

    public SizeDTO sizeToSizeDTO(Size size) {
        SizeDTO sizeDTO = new SizeDTO();
        sizeDTO.setId(size.getId());
        sizeDTO.setTitle(size.getTitle());

        return sizeDTO;
    }

}
