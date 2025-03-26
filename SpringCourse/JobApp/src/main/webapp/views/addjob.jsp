<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
    <div class="container">
        <main>
            <div class="row h-100 justify-content-sm-center align-items-center">
                <div class="col-md-7 col-lg-8">
                    <h4 class="mb-3">Job Creator</h4>
                    <form class="" action="handleForm" method="post">
                        <div class="row g-3">
                            <div class="col-sm-2">
                                <label for="postId" class="form-label">Post ID</label>
                                <input type="text" class="form-control" id="postId" name="postId" required="">
                            </div>

                            <div class="col-sm-10">
                                <label for="postProfile" class="form-label">Post Profile</label>
                                <input type="text" class="form-control" id="postProfile" name="postProfile" required="">
                            </div>

                            <div class="col-12">
                                <label for="reqExperience" class="form-label">Experience Required</label>
                                <input type="text" class="form-control" id="reqExperience" name="reqExperience">
                            </div>

                            <div class="col-12">
                                <label for="postDesc" class="form-label">Post Description</label>
                                <div class="input-group has-validation">
                                    <span class="input-group-text">#</span>
                                    <textarea type="text" class="form-control" id="postDesc" placeholder="Description"
                                        name="postDesc" required=""></textarea>
                                </div>
                            </div>

                            <div class="col-md-5">
                                <label for="postTechStack" class="form-label">Techs Requireds</label>
                                <select multiple class="form-select" id="postTechStack" name="postTechStack" required="">
                                    <option value="">Choose...</option>
                                    <option value="Java">Java</option>
                                    <option value="Javascript">Javascript</option>
                                    <option value="Go">Go</option>
                                    <option value="Ruby">Ruby</option>
                                    <option value="Python">Python</option>
                                </select>
                            </div>

                            <hr class="my-4">

                            <button class="w-100 btn btn-primary btn-lg" type="submit">Register</button>
                    </form>
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