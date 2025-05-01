.class public Lcom/join/mgps/activity/TestHtmlActivity$b;
.super Ljava/lang/Object;
.source "TestHtmlActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/TestHtmlActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field final synthetic b:Lcom/join/mgps/activity/TestHtmlActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/TestHtmlActivity;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/TestHtmlActivity$b;->b:Lcom/join/mgps/activity/TestHtmlActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/activity/TestHtmlActivity$b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public openImage([Ljava/lang/String;I)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    return-void
.end method
