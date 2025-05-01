.class public Lcom/join/mgps/Util/HtmlDocUtil$e;
.super Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;
.source "HtmlDocUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/Util/HtmlDocUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public c:Landroid/text/SpannableStringBuilder;


# direct methods
.method public constructor <init>(Landroid/text/SpannableStringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/Util/HtmlDocUtil$e;->c:Landroid/text/SpannableStringBuilder;

    return-void
.end method


# virtual methods
.method public d()Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/Util/HtmlDocUtil$e;->c:Landroid/text/SpannableStringBuilder;

    return-object v0
.end method
