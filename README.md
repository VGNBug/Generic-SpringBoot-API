# Generic-SpringBoot-API

This project currently serves as a template spring API, build with gradle, with the following properties:

- Building with Circle CI (see circle.yml).
- Deployment with Heroku (see Procfile).

The project provides some generic spring-boot tooling, making use of generics to reduce the need for boilerplate code in spring-boot projects.

This project can be forked and refactored for use as the basis of other projects.

## Developer setup

The project uses gradle as it's build tool, so that it can be forked directly as a quick-start project.

This project uses [HtmlUtils](https://github.com/VGNBug/HtmlUtils) as a gradle sub-project. As such, this project should be cloned using the following command:

`git clone --recursive https://github.com/VGNBug/HtmlUtils.git && cd HtmlUtils/ && git checkout master

## Contact

If you have any questions, please contact the project lead, Dan at daniel.pawsey@live.co.uk
