.class public abstract Lcom/join/mgps/base/decoration/GridDecoration$b;
.super Ljava/lang/Object;
.source "GridDecoration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/base/decoration/GridDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field protected a:I

.field protected b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/mgps/base/decoration/GridDecoration$b;->a:I

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/graphics/Canvas;IIII)V
.end method
