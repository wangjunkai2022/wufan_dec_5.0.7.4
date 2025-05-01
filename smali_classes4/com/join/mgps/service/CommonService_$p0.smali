.class Lcom/join/mgps/service/CommonService_$p0;
.super Ljava/lang/Object;
.source "CommonService_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService_;->J1(Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/CollectionBeanSub;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Z

.field final synthetic h:Lcom/join/mgps/dto/DownloadGameArgsBean;

.field final synthetic i:Lcom/join/mgps/service/CommonService_;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService_;Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService_$p0;->i:Lcom/join/mgps/service/CommonService_;

    iput-object p2, p0, Lcom/join/mgps/service/CommonService_$p0;->b:Lcom/join/mgps/dto/CollectionBeanSub;

    iput-boolean p3, p0, Lcom/join/mgps/service/CommonService_$p0;->c:Z

    iput-boolean p4, p0, Lcom/join/mgps/service/CommonService_$p0;->d:Z

    iput-object p5, p0, Lcom/join/mgps/service/CommonService_$p0;->e:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/join/mgps/service/CommonService_$p0;->f:Z

    iput-boolean p7, p0, Lcom/join/mgps/service/CommonService_$p0;->g:Z

    iput-object p8, p0, Lcom/join/mgps/service/CommonService_$p0;->h:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_$p0;->i:Lcom/join/mgps/service/CommonService_;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_$p0;->b:Lcom/join/mgps/dto/CollectionBeanSub;

    iget-boolean v2, p0, Lcom/join/mgps/service/CommonService_$p0;->c:Z

    iget-boolean v3, p0, Lcom/join/mgps/service/CommonService_$p0;->d:Z

    iget-object v4, p0, Lcom/join/mgps/service/CommonService_$p0;->e:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/join/mgps/service/CommonService_$p0;->f:Z

    iget-boolean v6, p0, Lcom/join/mgps/service/CommonService_$p0;->g:Z

    iget-object v7, p0, Lcom/join/mgps/service/CommonService_$p0;->h:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static/range {v0 .. v7}, Lcom/join/mgps/service/CommonService_;->A2(Lcom/join/mgps/service/CommonService_;Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    return-void
.end method
