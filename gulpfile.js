var gulp = require('gulp'),
concat = require('gulp-concat'),
uglify = require('gulp-uglify');

gulp.task('application', function() {
    gulp.src('public/javascripts/*.js')
    .pipe(concat('application.js'))
    .pipe(uglify())
    .pipe(gulp.dest('public/build/'))
});