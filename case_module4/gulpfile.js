var gulp = require('gulp'),
    watch = require('gulp-watch');

gulp.task('watch', function () {
  return watch('src/main/webapp/**/*.*', () => {
    gulp.src('src/main/webapp/**')
        //replace with build/resources/main/ for netBeans
        .pipe(gulp.dest('D:\\apache-tomcat-9.0.65-windows-x64\\apache-tomcat-9.0.65\\webapps\\ROOT\\'));
  });
});

gulp.task('watch');