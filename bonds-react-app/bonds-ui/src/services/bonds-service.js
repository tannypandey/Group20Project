import http from './axios-common';
export function getAllBonds(){
        return http.get("/bonds");
        
}
export function getAllCode(){
        return http.get("/code");
        
}
export function getAllIssuer(){
        return http.get("/issuer");
        
}
export function getAllCounterparty(){
        return http.get("/counterparty");
        
}