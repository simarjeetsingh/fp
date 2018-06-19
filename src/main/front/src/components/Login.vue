<template>
    <div id="main" data-spy="scroll" data-target=".navbar-collapse" data-offset="50">
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="glyphicon glyphicon-menu-hamburger"></span>
                    </button>
                </div>
                <div class="collapse navbar-collapse text-center" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li><a href="#about">ABOUT</a></li>
                        <li><a href="#portfolio">PORTFOLIO</a></li>
                        <li><a href="#contact">CONTACT</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="jumbotron text-center">
            <h1>Jimmy Höglund</h1>
            <hr>
            <p class="landing-par">Studying computer science in Borlänge, Sweden.</p>
            <a href="#about" title="Scroll down">
                <span class="glyphicon glyphicon-chevron-down"></span></a>
            <br>
            <a href="#about" class="jumbotronBtn btn">Read more</a>
        </div>

        <div class="container-fluid" id="about">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-xs-12">
                        <h2 class="text-center">about me</h2>
                        <hr>
                        <p> Hello, my name is Jimmy Höglund and I'm studying computer science (systemvetenskap in
                            swedish) at built a handful of custom-built computers. On my free time I like to hang out with friends
                            and play video-games with them.</p>
                        <br>
                    </div>
                    <div class="col-md-4">
                        <img class="img-responsive img-circle slideanim hideImage"
                             src="https://i.gyazo.com/b405d75939b924e34182bbe88d3d1032.png"
                             alt="Picture of me" align="right">
                    </div>
                </div>
            </div>
            <br>

            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <img src="https://makdigitaldesign.com/services/wp-content/uploads/2014/03/responsive-design1.png"
                             class="slideanim hideImage img-responsive devices">
                    </div>

                    <div class="col-md-8 col-xs-12">
                        <h2 class="text-center">about the website</h2>
                        <hr>
                        <p>Lately I've found a big interest in designing and developing modern and responsive websites.
                            A friend
                            recommended the <a href="https://www.freecodecamp.com" target="_blank"
                                               title="https://www.freecodecamp.com">Free
                                Code Camp</a>
                            course to me and I've been working
                            throught that in order to learn as much as I can. The course involves pointers on how I can
                            improve
                            it! </p>
                    </div>
                </div>
            </div>
        </div>

        <div class="container-fluid bg-grey text-center" style="margin-right: 0; padding-right: 0;" id="portfolio">
            <h2 class="text-center">Portfolio</h2>
            <hr>
            <div class="row" align="center">

                <div class="col-md-3 col-sm-6 col-xs-12">
                    <a href="https://codepen.io/ColtoN899/full/GjgYEm/" target="_blank">
                        <div class="hovereffect">

                            <img class="img-responsive portfolioImg"
                                 src="https://i.gyazo.com/870a33aad56b45a5f3616fe10ce33849.png">


                            <div class="overlay">
                                <h2>Random quote widget</h2>

                                <p>Go to website</p>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <a href="https://codepen.io/ColtoN899/full/zKxQLO/" target="_blank">
                        <div class="hovereffect">
                            <img class="img-responsive portfolioImg"
                                 src="https://gyazo.com/f66964cea4f93978e5ee84cad67cff88.png">

                            <div class="overlay">
                                <h2>Local weather widget</h2>

                                <p>Go to website</p>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <a href="https://codepen.io/ColtoN899/full/NRGZkN/" target="_blank">
                        <div class="hovereffect">
                            <img class="img-responsive portfolioImg"
                                 src="https://i.gyazo.com/57c817847cbc1d7528dc48c2faa68429.png">

                            <div class="overlay">
                                <h2>Wikipedia viewer</h2>

                                <p>Go to website</p>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="hovereffect">
                        <img class="img-responsive portfolioImg"
                             src="https://readytheme.net/wp-content/uploads/2015/12/ee2.png">

                        <div class="overlay">
                            <h2></h2>

                            <p>PLACEHOLDER IMAGE</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container-fluid" id="contact">

            <h2 class="text-center">contact</h2>
            <hr>

            <div class="container contactContainer">
                <form id="contactForm">
                    <div class="form-group">
                        <label for="name" class="">Name</label>
                        <input type="text" class="form-control" id="name" placeholder="First & Last">
                    </div>

                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" placeholder="example@domain.com">
                    </div>

                    <div class="form-group">
                        <label for="message">Message</label>
                        <textarea placeholder="Enter text..." rows="4" class="form-control" id="message"
                                  form="contactForm"></textarea>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn contactBtn"><span class="glyphicon glyphicon-send"
                                                                           style="font-size: 12px"></span> Send
                        </button>
                    </div>

                </form>
            </div>
        </div>

        <footer class="container-fluid" id="footer">
            <div class="col-md-12 footerDiv col-xs-12 text-center">
                <a href="https://www.facebook.com" target="_blank"><i
                        class="fa fa-facebook-square" aria-hidden="true"></i></a>
                <a href="https://www.youtube.com/" target="_blank"><i
                        class="fa fa-youtube-square" aria-hidden="true"></i></a>
                <a href="https://www.linkedin.com/" target="_blank"><i
                        class="fa fa-linkedin-square" aria-hidden="true"></i></a>
                <a href="https://plus.google.com" target="_blank"><i
                        class="fa fa-google-plus-square" aria-hidden="true"></i></a>
                <p class="text-center copyright">© 2018, Fp informática, All rights reserved</p>
            </div>
        </footer>

    </div>
</template>
<style>
    /*.hovereffect:hover img {*/
      /*opacity: 0.4;*/
      /*filter: alpha(opacity=40);*/
       /*-webkit-transform: translate3d(0, 0, 0);*/
      /*transform: translate3d(0, 0, 0);*/
    /*}*/
    /*.hovereffect a, .hovereffect p {*/
        /*color: #FFF;*/
        /*opacity: 0;*/
        /*filter: alpha(opacity=0);*/
         /*-webkit-transition: opacity 0.35s, -webkit-transform 0.35s;*/
        /*transition: opacity 0.35s, transform 0.35s;*/
         /*-webkit-transform: translate3d(100%, 0, 0);*/
        /*transform: translate3d(100%, 0, 0);*/
    /*}*/

    /*.hovereffect:hover a, .hovereffect:hover p, .hovereffect:hover h2 {*/
        /*opacity: 1;*/
        /*filter: alpha(opacity=100);*/
         /*-webkit-transform: translate3d(0, 0, 0);*/
        /*transform: translate3d(0, 0, 0);*/
    /*}*/

</style>

<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import axios from 'axios';
    import * as $ from 'jquery';

    @Component({
        name: 'login',
    })
    export default class Login extends Vue {

        model = {username: '', password: '', introduction: ''};
        errored = false;

        // $(document).ready(function() {
        // mounted() {
        //     let scrollTop = $(window).scrollTop();
        //     let checkIfTop = (scrollTop == 0);
        //     let navbar = $('.navbar');
        //     let collapse = $('.collapse');
        //
        //     //Navbar color on page load
        //     if (screen.width <= 600) {
        //         navbar.css('background-color', 'transparent');
        //         collapse.css("background-color", "#242B35");
        //         collapse.css("border-color", "transparent");
        //     } else if (screen.width > 600 && scrollTop > 0) {
        //         navbar.css('background-color', '#242B35');
        //         $('.navbar li a, .navbar').css('font-size', '15px');
        //     } else {
        //         navbar.css('background-color', 'transparent');
        //         $('.navbar li a, .navbar').css('font-size', '12px');
        //     }
        //
        //
        //     // //Close collapse menu after click on small screens
        //     // $(document).on('click', '.navbar-collapse.in', function(e) {
        //     //     if ($(e.target).is('a') && $(e.target).attr('class') != 'dropdown-toggle') {
        //     //         $(this).collapse('hide');
        //     //     }
        //     // });
        //
        //
        //     //Slide animation images
        //     $(".slideanim").each(function () {
        //         let pos = $(this).offset().top;
        //
        //         if (pos < scrollTop + 600) {
        //             $(this).removeClass("hideImage");
        //         } else {
        //             $(window).on('scroll', function () {
        //                 $(".slideanim").each(function () {
        //                     let pos = $(this).offset().top;
        //
        //                     if ((screen.height > 1000) && (pos < scrollTop + 800)) {
        //                         $(this).addClass("animated fadeInUp");
        //                         $(this).removeClass("hideImage");
        //                     } else if ((screen.height < 800) && (pos < scrollTop + 600)) {
        //                         $(this).addClass("animated fadeInUp");
        //                         $(this).removeClass("hideImage");
        //                     }
        //                 });
        //             });
        //         } //end else
        //     });
        //
        //     //Navbar slide function
        //     $(window).on('scroll', function () {
        //         scrollTop = $(window).scrollTop();
        //
        //         if (scrollTop == 0 && screen.width > 600) {
        //             checkIfTop = true;
        //             navbar.css('background-color', 'transparent');
        //             $('.navbar li a, .navbar').css('font-size', '12px');
        //
        //         } else if (scrollTop != 0 && screen.width > 600) {
        //             if (checkIfTop) {
        //                 checkIfTop = false;
        //                 navbar.css('background-color', '#242B35');
        //                 $('.navbar li a, .navbar').css('font-size', '15px');
        //             }
        //         }
        //     });
        //
        // };
    }
</script>
