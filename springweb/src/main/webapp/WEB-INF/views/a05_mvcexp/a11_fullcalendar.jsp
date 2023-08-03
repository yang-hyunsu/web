<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Good day!!</title>
<script src='${path}/a00_com/dist/index.global.js'></script>
<script>

  document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
      headerToolbar: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay'
      },
      initialDate: '2023-08-03',
      navLinks: true, // can click day/week names to navigate views
      selectable: true,
      selectMirror: true,
      select: function(arg) {
        var title = prompt('Event Title:');
        if (title) {
          calendar.addEvent({
            title: title,
            start: arg.start,
            end: arg.end,
            allDay: arg.allDay
          })
        }
        calendar.unselect()
      },
      eventClick: function(arg) {
        if (confirm('Are you sure you want to delete this event?')) {
          arg.event.remove()
        }
      },
      editable: true,
      dayMaxEvents: true, // allow "more" link when too many events
      events: [
    	{
              title: '풀캘린더시작',
              start: '2023-08-03'
        },
        {
          title: '전체일정',
          start: '2023-08-01'
        },
        {
          title: '긴일정',
          start: '2023-08-07',
          end: '2023-08-10'
        },
        {
          groupId: 999,
          title: '반복일정',
          start: '2023-08-09T16:00:00'
        },
        {
          groupId: 999,
          title: '반복일정',
          start: '2023-08-16T16:00:00'
        },
        {
          title: '회의',
          start: '2023-08-11',
          end: '2023-08-13'
        },
        {
          title: '미팅',
          start: '2023-08-12T10:30:00',
          end: '2023-08-12T12:30:00'
        },
        {
          title: '점심',
          start: '2023-08-12T12:00:00'
        },
        {
          title: 'Meeting',
          start: '2023-08-12T14:30:00'
        },
        {
          title: 'Happy Hour',
          start: '2023-08-12T17:30:00'
        },
        {
          title: 'Dinner',
          start: '2023-08-12T20:00:00'
        },
        {
          title: 'Birthday Party',
          start: '2023-08-13T07:00:00'
        },
        {
          title: 'Click for Google',
          url: 'http://google.com/',
          start: '2023-08-28'
        }
      ]
    });

    calendar.render();
  });

</script>
<style>

  body {
    margin: 40px 10px;
    padding: 0;
    font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
    font-size: 14px;
  }

  #calendar {
    max-width: 1100px;
    margin: 0 auto;
  }

</style>

</head>
<body>
<div id='calendar'></div>
  
</body>
</html>