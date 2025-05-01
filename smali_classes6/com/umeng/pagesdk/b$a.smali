.class final Lcom/umeng/pagesdk/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/pagesdk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/umeng/pagesdk/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/umeng/pagesdk/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/pagesdk/b;-><init>(B)V

    sput-object v0, Lcom/umeng/pagesdk/b$a;->a:Lcom/umeng/pagesdk/b;

    return-void
.end method

.method static synthetic a()Lcom/umeng/pagesdk/b;
    .locals 1

    sget-object v0, Lcom/umeng/pagesdk/b$a;->a:Lcom/umeng/pagesdk/b;

    return-object v0
.end method
