package org.codeforall.converters;

import org.codeforall.command.RestFamilyDto;
import org.codeforall.model.Family;
import org.springframework.stereotype.Component;

@Component
public class FamilyToRestFamilyDto extends AbstractConverter<Family, RestFamilyDto> {


    @Override
    public RestFamilyDto convert(Family family) {

        RestFamilyDto restFamilyDto = new RestFamilyDto();

        restFamilyDto.setId(family.getId());
        restFamilyDto.setFamilyName(family.getFamilyName());
        restFamilyDto.setPhone(family.getPhone());
        restFamilyDto.setEmail(family.getEmail());
        restFamilyDto.setZipCode(family.getZipCode());
        restFamilyDto.setPets(family.getPets());
        restFamilyDto.setMeal(family.getMeal());
        restFamilyDto.setDescription(family.getDescription());
        restFamilyDto.setAvailable(family.isAvailable());

        return restFamilyDto;
    }
}
