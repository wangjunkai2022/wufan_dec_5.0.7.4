.class public Lcom/join/mgps/base/decoration/GridDecoration$a;
.super Lcom/join/mgps/base/decoration/GridDecoration$b;
.source "GridDecoration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/base/decoration/GridDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private g:Landroid/graphics/Paint;

.field public h:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/base/decoration/GridDecoration$b;-><init>(I)V

    const/high16 p1, -0x1000000

    .line 2
    iput p1, p0, Lcom/join/mgps/base/decoration/GridDecoration$a;->h:I

    .line 3
    new-instance p1, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/join/mgps/base/decoration/GridDecoration$a;->g:Landroid/graphics/Paint;

    .line 4
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;IIII)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/base/decoration/GridDecoration$a;->g:Landroid/graphics/Paint;

    iget v1, p0, Lcom/join/mgps/base/decoration/GridDecoration$a;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, p2

    int-to-float v4, p3

    int-to-float v5, p4

    int-to-float v6, p5

    .line 2
    iget-object v7, p0, Lcom/join/mgps/base/decoration/GridDecoration$a;->g:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method
