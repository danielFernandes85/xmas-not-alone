package org.codeforall.controllers.rest;

import org.codeforall.command.RestFamilyDto;
import org.codeforall.converters.FamilyToRestFamilyDto;
import org.codeforall.converters.RestFamilyDtoToFamily;
import org.codeforall.model.Family;
import org.codeforall.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RestFamilyController {

    private FamilyService familyService;

    private FamilyToRestFamilyDto familyToRestFamilyDto;
    private RestFamilyDtoToFamily restFamilyDtoToFamily;

    @RequestMapping(method = RequestMethod.GET, value = {"/{id}"})
    public ResponseEntity<RestFamilyDto> listFamily(@PathVariable Integer id) {
        Family family = null;

        try{
            family = familyService.getFamilyId(id);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(familyToRestFamilyDto.convert(family), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/", ""})
    public ResponseEntity<List<RestFamilyDto>> listFamily() {
        return new ResponseEntity<>(familyToRestFamilyDto.convert(familyService.listFamily()), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST, value ={"/", ""})
    public ResponseEntity<?> addFamily(@Valid @RequestBody RestFamilyDto restFamilyDto){

        Family family = restFamilyDtoToFamily.convert(restFamilyDto);

        Family savedFamily = familyService.addFamily(family);

        return new ResponseEntity<>(savedFamily, HttpStatus.CREATED);

    }

    @Autowired
    public void setRestFamilyDtoToFamily(RestFamilyDtoToFamily restFamilyDtoToFamily) {
        this.restFamilyDtoToFamily = restFamilyDtoToFamily;
    }

    @Autowired
    public void setFamilyService(FamilyService familyService) {
        this.familyService = familyService;
    }


    @Autowired
    public void setFamilyToRestFamilyDto(FamilyToRestFamilyDto familyToRestFamilyDto) {
        this.familyToRestFamilyDto = familyToRestFamilyDto;
    }
}

