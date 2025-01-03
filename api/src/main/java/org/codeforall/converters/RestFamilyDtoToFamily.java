package org.codeforall.converters;

import org.codeforall.command.RestFamilyDto;
import org.codeforall.model.Family;
import org.codeforall.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RestFamilyDtoToFamily implements Converter<RestFamilyDto, Family> {

    private FamilyService familyService;
    @Override
    public Family convert(RestFamilyDto restFamilyDto) {
        Family family = null;

        try{
            family = (restFamilyDto.getId() != null ? familyService.getFamilyId(restFamilyDto.getId()) : new Family());

            family.setFamilyName(restFamilyDto.getFamilyName());
            family.setPhone(restFamilyDto.getPhone());
            family.setEmail(restFamilyDto.getEmail());
            family.setZipCode(restFamilyDto.getZipCode());
            family.setPets(restFamilyDto.getPets());
            family.setMeal(restFamilyDto.getMeal());
            family.setDescription(restFamilyDto.getDescription());
            family.setAvailable(restFamilyDto.isAvailable());


        } catch(Error e){
            throw new RuntimeException(e);
        }

        return family;
    }


    @Autowired
    public void setFamilyService(FamilyService familyService) {
        this.familyService = familyService;
    }
}
