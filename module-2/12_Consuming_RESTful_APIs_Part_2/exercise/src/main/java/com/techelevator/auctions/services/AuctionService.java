package com.techelevator.auctions.services;

import com.techelevator.util.BasicLogger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

import java.util.HashMap;
import java.util.Map;

public class AuctionService {

    public static String API_BASE_URL = "http://localhost:3000/auctions/";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction add(Auction newAuction) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Auction> payload = new HttpEntity<>(newAuction, headers);
        Auction auction = null;
        try {
           auction = this.restTemplate.postForObject(API_BASE_URL,
                    payload,
                    Auction.class);

        } catch (RestClientResponseException ce) {
            BasicLogger.log("problem!! " + ce.getRawStatusCode() + ":" + ce.getStatusText());
        } catch (ResourceAccessException rae) {
            BasicLogger.log("lost connection with the server");
        }
        return auction;
    }

    public boolean update(Auction updatedAuction) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Auction> payload = new HttpEntity<>(updatedAuction, headers);
        boolean isUpdated = false;
        try {
            this.restTemplate.put(API_BASE_URL + updatedAuction.getId(), payload);
            isUpdated = true;
        } catch (RestClientResponseException ce) {
            BasicLogger.log("problem!! " + ce.getRawStatusCode() + ":" + ce.getStatusText());
        } catch (ResourceAccessException rae) {
            BasicLogger.log("lost connection with the server");
        }
        return isUpdated;


    }

    public boolean delete(int auctionId) {
        Map<String, String> pathParameters = new HashMap<>();
        pathParameters.put("id", Integer.toString(auctionId));

        try {
            this.restTemplate.delete(API_BASE_URL + "{id}", pathParameters);
            return true;
        } catch (RestClientResponseException ce) {
            BasicLogger.log("problem!! " + ce.getRawStatusCode() + ":" + ce.getStatusText());
        } catch (ResourceAccessException rae) {
            BasicLogger.log("lost connection with the server");
        }

        return false;
    }

    public Auction[] getAllAuctions() {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_BASE_URL, Auction[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auctions;
    }

    public Auction getAuction(int id) {
        Auction auction = null;
        try {
            auction = restTemplate.getForObject(API_BASE_URL + id, Auction.class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auction;
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_BASE_URL + "?title_like=" + title, Auction[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auctions;
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return auctions;
    }

    private HttpEntity<Auction> makeEntity(Auction auction) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(auction, headers);
    }

}
