INSERT actors ( actid, fname, lname ) VALUES ( 1, '�����', '������������' );
INSERT actors ( actid, fname, lname ) VALUES ( 2, '��������', '����������' );
INSERT actors ( actid, fname, lname ) VALUES ( 3, '�������', '�����������' );
INSERT actors ( actid, fname, lname ) VALUES ( 4, '������', '�����������' );
INSERT actors ( actid, fname, lname ) VALUES ( 5, '������', '�������' );
INSERT actors ( actid, fname, lname ) VALUES ( 6, '������', '������������' );
INSERT actors ( actid, fname, lname ) VALUES ( 7, '�����', '����������' );
INSERT actors ( actid, fname, lname ) VALUES ( 8, '�����', '��������' );
INSERT actors ( actid, fname, lname ) VALUES ( 9, '��������', '�����������' );
INSERT actors ( actid, fname, lname ) VALUES ( 10, 'N��', '�����');
INSERT actors ( actid, fname, lname ) VALUES ( 11, '�����', '����������' );
INSERT actors ( actid, fname, lname ) VALUES ( 12, '�������', '��������' );
INSERT actors ( actid, fname, lname ) VALUES ( 13, '�������', '���������' );
INSERT actors ( actid, fname, lname ) VALUES ( 14, '�����', '�������' );

INSERT directors ( did, fname, lname ) VALUES ( 15, '������', '�����������' );
INSERT directors ( did, fname, lname ) VALUES ( 16, '�������', '�������' );
INSERT directors ( did, fname, lname ) VALUES ( 17, '�������', '���������' );

INSERT categories ( catid, category ) VALUES ( 18, '�������' );
INSERT categories ( catid, category ) VALUES ( 19, '��������' );
INSERT categories ( catid, category ) VALUES ( 20, '��������' );


INSERT movies ( mid, title, pyear, production, duration, did) VALUES ( 21, '����� ��� �������', 1961, 'GRE', 85, 15 );
INSERT movies ( mid, title, pyear, production, duration, did) VALUES ( 22, '�����������', 1971, 'GRE', 122, 16 );
INSERT movies ( mid, title, pyear, production, duration, did) VALUES ( 23, '�� ������', 2007, 'GRE', 119, 17 );

INSERT copies ( barcode, mid, medium, price) VALUES (24, 21, 'DVD', 10 );
INSERT copies ( barcode, mid, medium, price) VALUES (25, 22, 'DVD', 10 );
INSERT copies ( barcode, mid, medium, price) VALUES (26, 23, 'Blu-Ray', 15 );

INSERT movie_actor ( mid, actid) VALUES ( 21, 1);
INSERT movie_actor ( mid, actid) VALUES ( 21, 2);
INSERT movie_actor ( mid, actid) VALUES ( 21, 3);
INSERT movie_actor ( mid, actid) VALUES ( 21, 4);
INSERT movie_actor ( mid, actid) VALUES ( 21, 5);
INSERT movie_actor ( mid, actid) VALUES ( 22, 2);
INSERT movie_actor ( mid, actid) VALUES ( 22, 6);
INSERT movie_actor ( mid, actid) VALUES ( 22, 7);
INSERT movie_actor ( mid, actid) VALUES ( 22, 8);
INSERT movie_actor ( mid, actid) VALUES ( 22, 9);
INSERT movie_actor ( mid, actid) VALUES ( 23, 10);
INSERT movie_actor ( mid, actid) VALUES ( 23, 11);
INSERT movie_actor ( mid, actid) VALUES ( 23, 12);
INSERT movie_actor ( mid, actid) VALUES ( 23, 13);
INSERT movie_actor ( mid, actid) VALUES ( 23, 14);

INSERT movie_cat (mid, catid) VALUES ( 21, 18);
INSERT movie_cat (mid, catid) VALUES ( 22, 19);
INSERT movie_cat (mid, catid) VALUES ( 23, 20);
