/*******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.ipa.callgraph;

/**
 * This just exists to enforce strong typing.
 */
public interface ContextKey {

  /**
   * A property of contexts that might be generally useful: the "caller" method ... used for call-string context schemes.
   */
  public final static ContextKey CALLER = new ContextKey() {
  };

  /**
   * A property of contexts that might be generally useful: the "call site" method ... used for call-string context schemes.
   */
  public final static ContextKey CALLSITE = new ContextKey() {
  };

  /**
   * A property of contexts that might be generally useful: an identifier for the receiver object ... used for object-sensitivity
   * context policies.
   * 
   * Known implementations (ContextItems) for RECEIVER include TypeAbstraction and InstanceKey
   */
  public final static ContextKey RECEIVER = new ContextKey() {
  };

  /**
   * context key representing some parameter index, useful, e.g. for CPA-style
   * context-sensitivity policies.
   */
  public static class ParameterKey implements ContextKey {
    public final int index;

    public ParameterKey(int index) {
      this.index = index;
    }
    
    @Override
    public String toString() {
      return "P" + index;
    }
  }
  
  /**
   * Generally useful constants for possible parameter indices 
   */
  public static final ContextKey PARAMETERS[] = new ContextKey[]{
    new ParameterKey(0),
    new ParameterKey(1),
    new ParameterKey(2),
    new ParameterKey(3),
    new ParameterKey(4),
    new ParameterKey(5),
    new ParameterKey(6),
    new ParameterKey(7),
    new ParameterKey(8),
    new ParameterKey(9),
    new ParameterKey(10),
    new ParameterKey(11),
    new ParameterKey(12),
    new ParameterKey(13),
    new ParameterKey(14),
    new ParameterKey(15),
    new ParameterKey(16),
    new ParameterKey(17),
    new ParameterKey(18),
    new ParameterKey(19),
    new ParameterKey(20),
    new ParameterKey(21),
    new ParameterKey(22),
    new ParameterKey(23),
    new ParameterKey(24),
    new ParameterKey(25),
    new ParameterKey(26),
    new ParameterKey(27),
    new ParameterKey(28),
    new ParameterKey(29),
    new ParameterKey(30),
    new ParameterKey(31),
    new ParameterKey(32),
    new ParameterKey(33),
    new ParameterKey(34),
    new ParameterKey(35),
    new ParameterKey(36),
    new ParameterKey(37),
    new ParameterKey(38),
    new ParameterKey(39),
    new ParameterKey(40),
    new ParameterKey(41),
    new ParameterKey(42),
    new ParameterKey(43),
    new ParameterKey(44),
    new ParameterKey(45),
    new ParameterKey(46),
    new ParameterKey(47),
    new ParameterKey(48),
    new ParameterKey(49),
    //added based on functions seen in the wild...
    //---------
    new ParameterKey(50),
    new ParameterKey(51),
    new ParameterKey(52),
    new ParameterKey(53),
    new ParameterKey(54),
    new ParameterKey(55),
    new ParameterKey(56),
    new ParameterKey(57),
    new ParameterKey(58),
    new ParameterKey(59),
    new ParameterKey(60),
    new ParameterKey(61),
    new ParameterKey(62),
    new ParameterKey(63),
    new ParameterKey(64),
    new ParameterKey(65),
    new ParameterKey(66),
    new ParameterKey(67),
    new ParameterKey(68),
    new ParameterKey(69),
    new ParameterKey(70),
    new ParameterKey(71),
    new ParameterKey(72),
    new ParameterKey(73),
    new ParameterKey(74),
    new ParameterKey(75),
    new ParameterKey(76),
    new ParameterKey(77),
    new ParameterKey(78),
    new ParameterKey(79),
    new ParameterKey(80),
    new ParameterKey(81),
    new ParameterKey(82),
    new ParameterKey(83),
    new ParameterKey(84),
    new ParameterKey(85),
    new ParameterKey(86),
    new ParameterKey(87),
    new ParameterKey(88),
    new ParameterKey(89),
    new ParameterKey(90),
    new ParameterKey(91),
    new ParameterKey(92),
    new ParameterKey(93),
    new ParameterKey(94),
    new ParameterKey(95),
    new ParameterKey(96),
    new ParameterKey(97),
    new ParameterKey(98),
    new ParameterKey(99),
    new ParameterKey(100),
    new ParameterKey(101),
    new ParameterKey(102),
    new ParameterKey(103),
    new ParameterKey(104),
    new ParameterKey(105),
    new ParameterKey(106),
    new ParameterKey(107),
    new ParameterKey(108),
    new ParameterKey(109),
    new ParameterKey(110),
    new ParameterKey(111),
    new ParameterKey(112),
    new ParameterKey(113),
    new ParameterKey(114),
    new ParameterKey(115),
    new ParameterKey(116),
    new ParameterKey(117),
    new ParameterKey(118),
    new ParameterKey(119),
    new ParameterKey(120),
    new ParameterKey(121),
    new ParameterKey(122),
    new ParameterKey(123),
    new ParameterKey(124),
    new ParameterKey(125),
    new ParameterKey(126),
    new ParameterKey(127),
    new ParameterKey(128),
    new ParameterKey(129),
    new ParameterKey(130),
    new ParameterKey(131),
    new ParameterKey(132),
    new ParameterKey(133),
    new ParameterKey(134),
    new ParameterKey(135),
    new ParameterKey(136),
    new ParameterKey(137),
    new ParameterKey(138),
    new ParameterKey(139),
    new ParameterKey(140),
    new ParameterKey(141),
    new ParameterKey(142),
    new ParameterKey(143),
    new ParameterKey(144),
    new ParameterKey(145),
    new ParameterKey(146),
    new ParameterKey(147),
    new ParameterKey(148),
    new ParameterKey(149),
    new ParameterKey(150),
    new ParameterKey(151),
    new ParameterKey(152),
    new ParameterKey(153),
    new ParameterKey(154),
    new ParameterKey(155),
    new ParameterKey(156),
    new ParameterKey(157),
    new ParameterKey(158),
    new ParameterKey(159),
    new ParameterKey(160),
    new ParameterKey(161),
    new ParameterKey(162),
    new ParameterKey(163),
    new ParameterKey(164),
    new ParameterKey(165),
    new ParameterKey(166),
    new ParameterKey(167),
    new ParameterKey(168),
    new ParameterKey(169),
    new ParameterKey(170),
    new ParameterKey(171),
    new ParameterKey(172),
    new ParameterKey(173),
    new ParameterKey(174),
    new ParameterKey(175),
    new ParameterKey(176),
    new ParameterKey(177),
    new ParameterKey(178),
    new ParameterKey(179),
    new ParameterKey(180),
    new ParameterKey(181),
    new ParameterKey(182),
    new ParameterKey(183),
    new ParameterKey(184),
    new ParameterKey(185),
    new ParameterKey(186),
    new ParameterKey(187),
    new ParameterKey(188),
    new ParameterKey(189),
    new ParameterKey(190),
    new ParameterKey(191),
    new ParameterKey(192),
    new ParameterKey(193),
    new ParameterKey(194),
    new ParameterKey(195),
    new ParameterKey(196),
    new ParameterKey(197),
    new ParameterKey(198),
    new ParameterKey(199),
    new ParameterKey(200),
    new ParameterKey(201),
    new ParameterKey(202),
    new ParameterKey(203),
    new ParameterKey(204),
    new ParameterKey(205),
    new ParameterKey(206),
    new ParameterKey(207),
    new ParameterKey(208),
    new ParameterKey(209),
    new ParameterKey(210),
    new ParameterKey(211),
    new ParameterKey(212),
    new ParameterKey(213),
    new ParameterKey(214),
    new ParameterKey(215),
    new ParameterKey(216),
    new ParameterKey(217),
    new ParameterKey(218),
    new ParameterKey(219),
    new ParameterKey(220),
    new ParameterKey(221),
    new ParameterKey(222),
    new ParameterKey(223),
    new ParameterKey(224),
    new ParameterKey(225),
    new ParameterKey(226),
    new ParameterKey(227),
    new ParameterKey(228),
    new ParameterKey(229),
    new ParameterKey(230),
    new ParameterKey(231),
    new ParameterKey(232),
    new ParameterKey(233),
    new ParameterKey(234),
    new ParameterKey(235),
    new ParameterKey(236),
    new ParameterKey(237),
    new ParameterKey(238),
    new ParameterKey(239),
    new ParameterKey(240),
    new ParameterKey(241),
    new ParameterKey(242),
    new ParameterKey(243),
    new ParameterKey(244),
    new ParameterKey(245),
    new ParameterKey(246),
    new ParameterKey(247),
    new ParameterKey(248),
    new ParameterKey(249),
    new ParameterKey(250),
    new ParameterKey(251),
    new ParameterKey(252),
    new ParameterKey(253),
    new ParameterKey(254),
    new ParameterKey(255),
    new ParameterKey(256),
    new ParameterKey(257),
    new ParameterKey(258),
    new ParameterKey(259),
    new ParameterKey(260),
    new ParameterKey(261),
    new ParameterKey(262),
    new ParameterKey(263),
    new ParameterKey(264),
    new ParameterKey(265),
    new ParameterKey(266),
    new ParameterKey(267),
    new ParameterKey(268),
    new ParameterKey(269),
    new ParameterKey(270),
    new ParameterKey(271),
    new ParameterKey(272),
    new ParameterKey(273),
    new ParameterKey(274),
    new ParameterKey(275),
    new ParameterKey(276),
    new ParameterKey(277),
    new ParameterKey(278),
    new ParameterKey(279),
    new ParameterKey(280),
    new ParameterKey(281),
    new ParameterKey(282),
    new ParameterKey(283),
    new ParameterKey(284),
    new ParameterKey(285),
    new ParameterKey(286),
    new ParameterKey(287),
    new ParameterKey(288),
    new ParameterKey(289),
    new ParameterKey(290),
    new ParameterKey(291),
    new ParameterKey(292),
    new ParameterKey(293),
    new ParameterKey(294),
    new ParameterKey(295),
    new ParameterKey(296),
    new ParameterKey(297),
    new ParameterKey(298),
    new ParameterKey(299),
    new ParameterKey(300),
    new ParameterKey(301),
    new ParameterKey(302),
    new ParameterKey(303),
    new ParameterKey(304),
    new ParameterKey(305),
    new ParameterKey(306),
    new ParameterKey(307),
    new ParameterKey(308),
    new ParameterKey(309),
    new ParameterKey(310),
    new ParameterKey(311),
    new ParameterKey(312),
    new ParameterKey(313),
    new ParameterKey(314),
    new ParameterKey(315),
    new ParameterKey(316),
    new ParameterKey(317),
    new ParameterKey(318),
    new ParameterKey(319),
    new ParameterKey(320),
    new ParameterKey(321),
    new ParameterKey(322),
    new ParameterKey(323),
    new ParameterKey(324),
    new ParameterKey(325),
    new ParameterKey(326),
    new ParameterKey(327),
    new ParameterKey(328),
    new ParameterKey(329),
    new ParameterKey(330),
    new ParameterKey(331),
    new ParameterKey(332),
    new ParameterKey(333),
    new ParameterKey(334),
    new ParameterKey(335),
    new ParameterKey(336),
    new ParameterKey(337),
    new ParameterKey(338),
    new ParameterKey(339),
    new ParameterKey(340),
    new ParameterKey(341),
    new ParameterKey(342),
    new ParameterKey(343),
    new ParameterKey(344),
    new ParameterKey(345),
    new ParameterKey(346),
    new ParameterKey(347),
    new ParameterKey(348),
    new ParameterKey(349),
    new ParameterKey(350),
    new ParameterKey(351),
    new ParameterKey(352),
    new ParameterKey(353),
    new ParameterKey(354),
    new ParameterKey(355),
    new ParameterKey(356),
    new ParameterKey(357),
    new ParameterKey(358),
    new ParameterKey(359),
    new ParameterKey(360),
    new ParameterKey(361),
    new ParameterKey(362),
    new ParameterKey(363),
    new ParameterKey(364),
    new ParameterKey(365),
    new ParameterKey(366),
    new ParameterKey(367),
    new ParameterKey(368),
    new ParameterKey(369),
    new ParameterKey(370),
    new ParameterKey(371),
    new ParameterKey(372),
    new ParameterKey(373),
    new ParameterKey(374),
    new ParameterKey(375),
    new ParameterKey(376),
    new ParameterKey(377),
    new ParameterKey(378),
    new ParameterKey(379),
    new ParameterKey(380),
    new ParameterKey(381),
    new ParameterKey(382),
    new ParameterKey(383),
    new ParameterKey(384),
    new ParameterKey(385),
    new ParameterKey(386),
    new ParameterKey(387),
    new ParameterKey(388),
    new ParameterKey(389),
    new ParameterKey(390),
    new ParameterKey(391),
    new ParameterKey(392),
    new ParameterKey(393),
    new ParameterKey(394),
    new ParameterKey(395),
    new ParameterKey(396),
    new ParameterKey(397),
    new ParameterKey(398),
    new ParameterKey(399),
    new ParameterKey(400),
    new ParameterKey(401),
    new ParameterKey(402),
    new ParameterKey(403),
    new ParameterKey(404),
    new ParameterKey(405),
    new ParameterKey(406),
    new ParameterKey(407),
    new ParameterKey(408),
    new ParameterKey(409),
    new ParameterKey(410),
    new ParameterKey(411),
    new ParameterKey(412),
    new ParameterKey(413),
    new ParameterKey(414),
    new ParameterKey(415),
    new ParameterKey(416),
    new ParameterKey(417),
    new ParameterKey(418),
    new ParameterKey(419),
    new ParameterKey(420),
    new ParameterKey(421),
    new ParameterKey(422),
    new ParameterKey(423),
    new ParameterKey(424),
    new ParameterKey(425),
    new ParameterKey(426),
    new ParameterKey(427),
    new ParameterKey(428),
    new ParameterKey(429),
    new ParameterKey(430),
    new ParameterKey(431),
    new ParameterKey(432),
    new ParameterKey(433),
    new ParameterKey(434),
    new ParameterKey(435),
    new ParameterKey(436),
    new ParameterKey(437),
    new ParameterKey(438),
    new ParameterKey(439),
    new ParameterKey(440),
    new ParameterKey(441),
    new ParameterKey(442),
    new ParameterKey(443),
    new ParameterKey(444),
    new ParameterKey(445),
    new ParameterKey(446),
    new ParameterKey(447),
    new ParameterKey(448),
    new ParameterKey(449),
    new ParameterKey(450),
    new ParameterKey(451),
    new ParameterKey(452),
    new ParameterKey(453),
    new ParameterKey(454),
    new ParameterKey(455),
    new ParameterKey(456),
    new ParameterKey(457),
    new ParameterKey(458),
    new ParameterKey(459),
    new ParameterKey(460),
    new ParameterKey(461),
    new ParameterKey(462),
    new ParameterKey(463),
    new ParameterKey(464),
    new ParameterKey(465),
    new ParameterKey(466),
    new ParameterKey(467),
    new ParameterKey(468),
    new ParameterKey(469),
    new ParameterKey(470),
    new ParameterKey(471),
    new ParameterKey(472),
    new ParameterKey(473),
    new ParameterKey(474),
    new ParameterKey(475),
    new ParameterKey(476),
    new ParameterKey(477),
    new ParameterKey(478),
    new ParameterKey(479),
    new ParameterKey(480),
    new ParameterKey(481),
    new ParameterKey(482),
    new ParameterKey(483),
    new ParameterKey(484),
    new ParameterKey(485),
    new ParameterKey(486),
    new ParameterKey(487),
    new ParameterKey(488),
    new ParameterKey(489),
    new ParameterKey(490),
    new ParameterKey(491),
    new ParameterKey(492),
    new ParameterKey(493),
    new ParameterKey(494),
    new ParameterKey(495),
    new ParameterKey(496),
    new ParameterKey(497),
    new ParameterKey(498),
    new ParameterKey(499)
  };
}
