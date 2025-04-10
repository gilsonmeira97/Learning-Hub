<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ page import="com.learning.JobApp.model.JobPost" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JobSearch</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="../style.css">
</head>
<main class="d-flex flex-nowrap">
    <div class="d-flex flex-column flex-shrink-0 p-3 text-bg-dark" style="width: 280px;">
        <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
            <svg class="bi pe-none me-2" width="40" height="32">
                <use xlink:href="#bootstrap"></use>
            </svg>
            <span class="fs-4">JobSearch</span>
        </a>
        <hr>
        <ul class="nav nav-pills flex-column mb-auto">
            <li class="nav-item">
                <a href="home" class="nav-link active" aria-current="page">
                    <svg class="bi pe-none me-2" width="16" height="16">
                        <use xlink:href="#home"></use>
                    </svg>
                    Home
                </a>
            </li>
            <li>
                <a href="viewalljobs" class="nav-link text-white">
                    <svg class="bi pe-none me-2" width="16" height="16">
                        <use xlink:href="#speedometer2"></use>
                    </svg>
                    All Jobs
                </a>
            </li>
            <li>
                <a href="addjob" class="nav-link text-white">
                    <svg class="bi pe-none me-2" width="16" height="16">
                        <use xlink:href="#table"></use>
                    </svg>
                    Create Job
                </a>
            </li>
            <li>
                <a href="#" class="nav-link text-white">
                    <svg class="bi pe-none me-2" width="16" height="16">
                        <use xlink:href="#grid"></use>
                    </svg>
                    Contact
                </a>
            </li>
        </ul>
    </div>
    <div class="b-vr"></div>
    <%
        JobPost myJobPost = (JobPost) request.getAttribute("jobPost");
    %>
    <div class="container">
        <main>
            <div class="row h-100 justify-content-sm-center align-items-center">
                <div class="col-6">
                    <div class="card mb-4 rounded-3 shadow-sm h-100">
                        <div class="card-header py-3">
                            <h4 class="my-0 fw-normal">
                                ${jobPost.getPostProfile()}
                            </h4>
                        </div>
                        <div class="card-body">
                            <p class="card-title pricing-card-title">${jobPost.postDesc}</p>
                            <h6>Experience required: <%= myJobPost.getReqExperience() %><small
                                        class="text-body-secondary fw-light">/years</small></h6>
                            <ul class="list-unstyled mt-3 mb-4">
                                <% for (String tech : myJobPost.getPostTechStack()) { %>
                                    <li>
                                        <%= tech %>
                                    </li>
                                <% } %>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
</main>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>

</html>