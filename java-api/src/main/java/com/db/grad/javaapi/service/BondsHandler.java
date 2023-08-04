package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BondsHandler implements IBondsService
{
    @Autowired
    private SecurityRepository securityRepo;

    public BondsHandler( SecurityRepository securityRepo )
    {
        securityRepo = securityRepo;
    }

    @Override
    public List<Security> getAllSecurity()
    {
        return securityRepo.getAllSecurity();
    }

    @Override
    public List<Security> getAllMaturity() {
        return securityRepo.getAllMaturity();
    }

    @Override
    public List<Security> getAllCode() {
        return null;
    }

    @Override
    public List<Security> getAllIssuer() {
        return null;
    }

    @Override
    public List<Security> getAllCounterparty() {
        return null;
    }

    @Override
    public List<Security> getAllBooks() {
        return null;
    }

//    @Override
//    public Dog addDog(Dog theDog)
//    {
//        return itsDogsRepo.save( theDog );
//    }
//
//    @Override
//    public long getNoOfDogs()
//    {
//        return itsDogsRepo.count();
//    }
//
//    @Override
//    public boolean removeDog(long uniqueId)
//    {
//        boolean result = false;
//
//        Optional<Dog> theDog = itsDogsRepo.findById(uniqueId);
//        if(theDog.isPresent())
//        {
//            itsDogsRepo.delete(theDog.get());
//            result = true;
//        }
//
//        return  result;
//    }
//
//    @Override
//    public Dog getDogById(long uniqueId)
//    {
//        return itsDogsRepo.findById(uniqueId).get();
//    }
//
//    @Override
//    public Dog getDogByName(String dogsName )
//    {
//        Dog dogToFind = new Dog();
//        dogToFind.setName(dogsName);
//        List<Dog> dogs = itsDogsRepo.findByName(dogToFind);
//        Dog result = null;
//
//        if( dogs.size() == 1)
//            result = dogs.get(0);
//
//        return result;
//    }
//
//    @Override
//    public Dog updateDogDetails(Dog dogToUpdate)
//    {
//        return itsDogsRepo.save( dogToUpdate );
//    }
}
